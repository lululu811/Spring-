package com.netease.course;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.sun.corba.se.pept.transport.EventHandler;

@Component
public class Homeworke {

	@Value("${file.path}")
	String path;

	FileOutputStream fStream;

	@PostConstruct
	public void init() throws FileNotFoundException {
		File file = new File(this.path);
		if (file.exists()) {
		} else {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		fStream = new FileOutputStream(file);
	}

	public void write(String context) {
		System.out.println("I will write the context with " + context);
		byte[] string_write = context.getBytes();
		try {
			fStream.write(string_write, 0, string_write.length);
		} catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	@PreDestroy
	public void destory(){
		System.out.println("I will destory this method");
		if (fStream!=null) {
			try {
				fStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
	
}
