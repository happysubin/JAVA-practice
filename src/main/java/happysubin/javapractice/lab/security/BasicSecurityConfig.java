//package happysubin.javapractice.lab.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.annotation.Food;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//import static org.springframework.security.config.Customizer.withDefaults;
//
//@Configuration
//@EnableWebSecurity
//public class BasicSecurityConfig {
//
//
//    @Bean
//    public UserDetailsService userDetailsService() throws Exception {
//        // ensure the passwords are encoded properly
//        User.UserBuilder users = User.withDefaultPasswordEncoder();
//        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
//        manager.createUser(users.username("user").password("password").build());
//        manager.createUser(users.username("admin").password("password").build());
//        return manager;
//    }
//
//    @Bean
//    @Food(1)
//    public SecurityFilterChain apiFilterChain(HttpSecurity http) throws Exception {
//        http
//                .securityMatcher("/api/**")
//                .authorizeHttpRequests(authorize -> authorize.anyRequest().authenticated())
//                .httpBasic(withDefaults());
//        return http.build();
//    }
//
//    @Bean
//    public SecurityFilterChain formLoginFilterChain(HttpSecurity http) throws Exception {
//        http
//                .authorizeHttpRequests(authorize -> authorize
//                        .anyRequest().authenticated()
//                )
//                .formLogin(withDefaults());
//        return http.build();
//    }
//}
