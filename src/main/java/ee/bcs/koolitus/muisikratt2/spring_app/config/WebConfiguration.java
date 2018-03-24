package ee.bcs.koolitus.muisikratt2.spring_app.config;

import java.util.List;
import java.util.TimeZone;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

@Configuration
public class WebConfiguration extends WebMvcConfigurerAdapter {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/webjars/**").addResourceLocations(
				"classpath:/META-INF/resources/webjars/");
		registry.addResourceHandler("/static/**").addResourceLocations(
				"classpath:/static/");
	}

	@Override
	public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
		for (HttpMessageConverter<?> converter : converters) {
			if (converter instanceof MappingJackson2HttpMessageConverter) {
				MappingJackson2HttpMessageConverter jsonMessageConverter = (MappingJackson2HttpMessageConverter) converter;
				ObjectMapper objectMapper = jsonMessageConverter
						.getObjectMapper();
				objectMapper
						.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
				objectMapper.setTimeZone(TimeZone.getTimeZone("UTC"));
				break;
			}
		}
	}

}
