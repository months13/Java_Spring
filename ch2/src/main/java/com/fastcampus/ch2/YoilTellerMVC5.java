package com.fastcampus.ch2;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class YoilTellerMVC5 {
    @RequestMapping("/getYoilMVC") // http://localhost/ch2/getYoilMVC
    public String main(int year, int month, int day, Model model) { // �۾� ����� model�� �����Ѵ�.
 
        // 1. ��ȿ�� �˻� �޼��� ���� ���� ����.
    	if(!isValid(year, month, day)) 
    		return "yoilError";  // ��ȿ���� ������, /WEB-INF/views/yoilError.jsp�� �̵�
    	
        // 2. ó��
    	char yoil = getYoil(year, month, day);

        // 3. Model�� �۾� ��� ���� . view�� ����� �� ����Ѵ�.
        model.addAttribute("year", year);
        model.addAttribute("month", month);
        model.addAttribute("day", day);
        model.addAttribute("yoil", yoil);
        
        // 4. �۾� ����� ������ View�� �̸��� ��ȯ
        return "yoil"; // /WEB-INF/views/yoil.jsp ���� ���Ͽ� ����Ǿ��ִ�.
        // ���⼭ ��ȯŸ���� void�� �����ϸ� ���ε� URL�� ���� ���� �̸��� �����ȴ�.
        // ��, ModelAndView�� ��ȯŸ������ ���� �� �𵨰� �並 ��ĥ���ִ�. Model�� �� �൵ �� �̷��� �ϸ��
        // ModelAndViewŸ���� ���ǵǾ�����.
        // �پ��ϰ� ������ �� ������ ��������.
    }
    
    private char getYoil(int year, int month, int day) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);

        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        return " �Ͽ�ȭ�������".charAt(dayOfWeek);
    }
    
    private boolean isValid(int year, int month, int day) {    
    	if(year==-1 || month==-1 || day==-1) 
    		return false;
    	
    	return (1<=month && month<=12) && (1<=day && day<=31); // ����� �� �� Ȯ��.
    }
    
}