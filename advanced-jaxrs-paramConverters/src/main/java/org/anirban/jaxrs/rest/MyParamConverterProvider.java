package org.anirban.jaxrs.rest;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Calendar;

import javax.ws.rs.ext.ParamConverter;
import javax.ws.rs.ext.ParamConverterProvider;
import javax.ws.rs.ext.Provider;

@Provider
public class MyParamConverterProvider implements ParamConverterProvider {

	@Override
	public <T> ParamConverter<T> getConverter(Class<T> rawType, Type genericType, Annotation[] annotations) {
		if(rawType.getName().equals(MyDate.class.getName())){
			return new ParamConverter<T>() {

				@Override
				public T fromString(String value) {
					Calendar cal = Calendar.getInstance();
					if(value.equalsIgnoreCase("tomorrow")){
						cal.add(Calendar.DATE, 1);
					}else if(value.equalsIgnoreCase("yesterday")){
						cal.add(Calendar.DATE, -1);
					}
					MyDate date = new MyDate();
					date.setDay(cal.get(Calendar.DATE));
					date.setMonth(cal.get(Calendar.MONTH));
					date.setYear(cal.get(Calendar.YEAR));
					
					return rawType.cast(date);
				}

				@Override
				public String toString(T bean) {
					if(bean==null){
						return null;
					}
					return bean.toString();
				}
			};
		}
		return null;
	}

}
