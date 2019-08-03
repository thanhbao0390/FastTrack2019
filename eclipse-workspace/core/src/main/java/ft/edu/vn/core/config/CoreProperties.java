package ft.edu.vn.core.config;


import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="core")
public class CoreProperties {

	private final Security security = new Security();
	
	
	
	public Security getSecurity() {
		return security;
	}



	public static class Security {

		private String username;

		private String password;

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

//		public List<String> getRoles() {
//			return roles;
//		}
//
//		public void setRoles(List<String> roles) {
//			this.roles = roles;
//		}
//
//		private List<String> roles = new ArrayList<>(Collections.singleton("USER"));
//
		
	}
	
}
