package io.github.cr9c.day01.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Setter
//@Getter
//@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
	private String firstName;
	private String lastName;
	private boolean gender;
}
