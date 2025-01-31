package com.jdbcpratic;

public class mainpojo {



		
		String name,password,country,mail;
	int id;


		public mainpojo(String name, String password, String country, String mail) {
			super();
			this.id=id;
			this.name = name;
			this.password = password;
			this.country = country;
			this.mail = mail;
			
		}

		public mainpojo() {
			// TODO Auto-generated constructor stub
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getMail() {
			return mail;
		}

		public void setMail(String mail) {
			this.mail = mail;
		}
		public int getId() {
			return id;
		}

		public void setId(int string) {
			this.id = string;
		}


		@Override
		public String toString() {
			return "mainpojo [name=" + name + ", password=" + password + ", country=" + country + ", mail=" + mail
					+ "]";
		}

		public String id(int i) {
			// TODO Auto-generated method stub
			return null;
		}

		public void setId1(String string) {
			// TODO Auto-generated method stub
			
		}

		public void setId(String string) {
			// TODO Auto-generated method stub
			
		}
		
	

}
