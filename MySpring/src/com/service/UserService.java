package com.service;

public class UserService {

		private String name;
		private ByeService b;
		public ByeService getB() {
			return b;
		}

		public void setB(ByeService b) {
			this.b = b;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		public void sayHello() {
			System.out.println("Hello "+ name);
			b.sayBye();
		}
}
