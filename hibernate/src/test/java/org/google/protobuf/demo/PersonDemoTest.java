package org.google.protobuf.demo;

import static org.junit.Assert.*;

import org.google.protobuf.demo.PersonDemo.Person;
import org.google.protobuf.demo.PersonDemo.Person.Builder;
import org.junit.Assert;
import org.junit.Test;

import com.google.protobuf.InvalidProtocolBufferException;

import hh.mm.nn.MessageA;
import hh.mm.nn.MessageA.Message_A;

public class PersonDemoTest {
	
	@Test
	public void buildPerson(){
		PersonDemo.Person.Builder person = Person.newBuilder();
		person.addId("id");
		person.addIdCard(1);
		person.addName("name");
		//person.setId(index, value)
		//person.getNameList().add(1, "name1");
		System.out.println(person.getNameList().get(0));
		//person.getIdCardList().set(0, 2222222);
		//person.setId(3,"id");
		Assert.assertTrue("person 未序列化", person.isInitialized());
		Person per = person.build();
		Assert.assertTrue("per未序列化", per.isInitialized());
		Assert.assertEquals("不相等","id",per.getId(0));
        byte [] bytearry = per.toByteArray();
		try {
			@SuppressWarnings("static-access")
			Person i = per.parseFrom(bytearry);
			System.out.println(per.getId(0));
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
		
	}

	@Test
	public void buildMessageA(){
		MessageA.Message_A.Builder message = Message_A.newBuilder();
		message.setAge(1);
		message.setId(1);
		
		message.setSex("女");
		System.out.println(message.isInitialized());
		Message_A message_build = message.build();
		message_build.isInitialized();
		
	}
}
