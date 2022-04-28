package com.example.education;

import com.example.education.components.FileRead;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EducationApplicationTests {

	private FileRead fileRead;

	@Test
	void countContentTest() {
		fileRead.setCounter(1);
		System.out.println(fileRead.countContent("###", 2.0));
	}

	@Autowired
	public void setFileRead(FileRead fileRead) {
		this.fileRead = fileRead;
	}
}
