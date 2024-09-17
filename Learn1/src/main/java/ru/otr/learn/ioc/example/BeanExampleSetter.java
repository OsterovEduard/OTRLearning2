package ru.otr.learn.ioc.example;

import lombok.AccessLevel;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import java.util.List;
import java.util.Map;


@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BeanExampleSetter {
	String stringField;
	double doubleField;
	List<Object> list;
	Map<String, Object> map;

	public BeanExampleSetter() {
	}
}
