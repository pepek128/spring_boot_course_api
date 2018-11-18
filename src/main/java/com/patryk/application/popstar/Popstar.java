package com.patryk.application.popstar;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Popstar {

	@RequestMapping("/popstar")
	public String lyrics() {

		return ("Hey!\r\n" + "You ready for this? (Let's go!)\r\n" + "See 언제든지 내 모습 magic\r\n" + "단 한 번에 내가 잡어\r\n"
				+ "절대 기죽지 않지, uh!\r\n" + "Pow-pow 네가 뭘 알아\r\n" + "견딜 수 없어, 원해도\r\n" + "원하는 게 얼굴에 보여\r\n"
				+ "I'm trouble and you're wanting it\r\n" + "I'm so cold\r\n"
				+ "When I move that way, you gonna be so blown\r\n" + "I'm the realest in the game, uh");
	}

}
