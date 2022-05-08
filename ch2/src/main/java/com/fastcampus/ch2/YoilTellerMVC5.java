package com.fastcampus.ch2;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class YoilTellerMVC5 {
    @RequestMapping("/getYoilMVC") // http://localhost/ch2/getYoilMVC
    public String main(int year, int month, int day, Model model) { // 작업 결과를 model에 저장한다.
 
        // 1. 유효성 검사 메서드 따로 빼서 정리.
    	if(!isValid(year, month, day)) 
    		return "yoilError";  // 유효하지 않으면, /WEB-INF/views/yoilError.jsp로 이동
    	
        // 2. 처리
    	char yoil = getYoil(year, month, day);

        // 3. Model에 작업 결과 저장 . view가 출력할 때 사용한다.
        model.addAttribute("year", year);
        model.addAttribute("month", month);
        model.addAttribute("day", day);
        model.addAttribute("yoil", yoil);
        
        // 4. 작업 결과를 보여줄 View의 이름을 반환
        return "yoil"; // /WEB-INF/views/yoil.jsp 설정 파일에 저장되어있다.
        // 여기서 반환타입을 void로 설정하면 매핑된 URL에 의해 뷰의 이름이 결정된다.
        // 또, ModelAndView로 반환타입으로 설정 시 모델과 뷰를 합칠수있다. Model을 안 줘도 됨 이렇게 하면면
        // ModelAndView타입이 정의되어있음.
        // 다양하게 구현할 수 있음에 집중하자.
    }
    
    private char getYoil(int year, int month, int day) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);

        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        return " 일월화수목금토".charAt(dayOfWeek);
    }
    
    private boolean isValid(int year, int month, int day) {    
    	if(year==-1 || month==-1 || day==-1) 
    		return false;
    	
    	return (1<=month && month<=12) && (1<=day && day<=31); // 제대로 된 지 확인.
    }
    
}