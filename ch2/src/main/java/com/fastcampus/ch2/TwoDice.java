package com.fastcampus.ch2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller // ctrl shift o to auto import
public class TwoDice {
    @RequestMapping("/rollDice")
    //    public static void main(String[] args) {
    public void main(HttpServletResponse response) throws IOException {
        int idx1 = (int)(Math.random()*6)+1;
        int idx2 = (int)(Math.random()*6)+1;

        response.setContentType("text/html"); // send html file
        response.setCharacterEncoding("utf-8"); // encoding type utf-8 to recognize korean
        
        PrintWriter out = response.getWriter(); // send to browser
        
        out.println("<html>"); // html tag        
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        out.println("<img src='resources/img/dice"+idx1+".jpg'>"); // 
        out.println("<img src='resources/img/dice"+idx2+".jpg'>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}