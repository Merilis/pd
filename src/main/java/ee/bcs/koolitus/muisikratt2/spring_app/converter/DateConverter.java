package ee.bcs.koolitus.muisikratt2.spring_app.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.sql.Date;
import java.time.LocalDate;
 
@Converter(autoApply = true)
public class DateConverter implements AttributeConverter<LocalDate, Date> {
 
    @Override
    public Date convertToDatabaseColumn(LocalDate localDate) {
        return localDate != null ? Date.valueOf(localDate) : null;
    }
 
    @Override
    public LocalDate convertToEntityAttribute(Date date) {
        return date != null ? date.toLocalDate() : null;
    }
}
