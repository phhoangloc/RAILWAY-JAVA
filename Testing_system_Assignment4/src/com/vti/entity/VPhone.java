package com.vti.entity;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class VPhone extends Phone{
	private Contact[] contactArr;

	public VPhone() {
		contactArr = new Contact[] {};
	}


	@Override
	public String toString() {
		return "VPhone [contactArr=" + Arrays.toString(contactArr) + "]";
	}


	@Override
	public void insertContact(String name, String phone) {
		Contact contact = new Contact(name, phone);
		contactArr = Arrays.copyOf(contactArr, contactArr.length + 1);
		contactArr[contactArr.length - 1] = contact; 
		
	}

	@Override
	public void removeContact(String name) {
		int index = 0;
		int [] indexArr = new int[] {};
		if(contactArr.length>0) {
			for (Contact contact : contactArr) {
				if(contact.getName().equals(name)) {
					indexArr = ArrayUtils.add(indexArr, index);
				}
				index++;
			}
			if(indexArr.length>0) {
				contactArr = ArrayUtils.removeAll(contactArr, indexArr);
			}
			 
		}
		
	}

	@Override
	public void updateContact(String name, String newPhone) {
		int index = 0;
		int [] indexArr = new int[] {};
		if(contactArr.length>0) {
			Contact[] contactArr2 = new Contact[] {};
			for (Contact contact : contactArr) {
				if(contact.getName().equals(name)) {
					Contact newContact = new Contact(name, newPhone);
					contactArr2 = ArrayUtils.add(contactArr2, newContact);
					indexArr = ArrayUtils.add(indexArr, index);
				}
				index++;
			}
			contactArr = ArrayUtils.removeAll(contactArr, indexArr);
			contactArr = ArrayUtils.addAll(contactArr, contactArr2);
		}

		
	}

	@Override
	public void searchContact(String name) {
		if(contactArr.length>0) {
			Contact[] contactArr2 = new Contact[] {};
			for (Contact contact : contactArr) {
				if(contact.getName().equals(name)) {
					contactArr2 = ArrayUtils.add(contactArr2, contact);
				}
			}
			if(contactArr2.length>0) {
				contactArr = new Contact[] {};
				contactArr = contactArr2;
			}
		}
		
	}
	public void printContact() {
		for (Contact contact : contactArr) {
			System.out.println(contact);
		}
	}

}
