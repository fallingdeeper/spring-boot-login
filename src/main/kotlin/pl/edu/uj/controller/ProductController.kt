package pl.edu.uj.controller

import pl.edu.uj.login.Login
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.beans.factory.annotation.Autowired


import javax.servlet.http.HttpServletRequest
import javax.persistence.*

@RestController
@RequestMapping("/")
class ProductController() {


	@Autowired
	lateinit var loginProviders: Login

	@PostMapping("login/") 
	fun login(@RequestBody logi: String, @RequestBody  password: String): HttpStatus {
		loginProviders.login(logi, password) 
	return HttpStatus.OK	
	}
}
