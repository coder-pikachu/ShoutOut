package com.sample.firstapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class MyFirstAppServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/html");
		resp.getWriter()
				.println(
						"<html> <head> <meta http-equiv='content-type' content='text/html; charset=UTF-8'> <title>ShoutOut!</title> <style type='text/css'> body { background: #0c0d12; background-image: url('img/zenbg-1.png'), url('zenbg-2.png'); background-repeat: repeat-x, repeat; }  .content { width: 100%; text-align: center; }  .form-content { display: inline-block; top: 100px; }  .form-container { text-align: left; margin-top : 100px; border: 1px solid #6b6b6b; background: #7c7d80; background: -webkit-gradient(linear, left top, left bottom, from(#ffffff), to(#7c7d80)); background: -webkit-linear-gradient(top, #ffffff, #7c7d80); background: -moz-linear-gradient(top, #ffffff, #7c7d80); background: -ms-linear-gradient(top, #ffffff, #7c7d80); background: -o-linear-gradient(top, #ffffff, #7c7d80); background-image: -ms-linear-gradient(top, #ffffff 0%, #7c7d80 100%); -webkit-border-radius: 8px; -moz-border-radius: 8px; border-radius: 8px; -webkit-box-shadow: rgba(000, 000, 000, 0.9) 0 1px 2px, inset rgba(255, 255, 255, 0.4) 0 0px 0; -moz-box-shadow: rgba(000, 000, 000, 0.9) 0 1px 2px, inset rgba(255, 255, 255, 0.4) 0 0px 0; box-shadow: rgba(000, 000, 000, 0.9) 0 1px 2px, inset rgba(255, 255, 255, 0.4) 0 0px 0; font-family: 'Helvetica Neue', Helvetica, sans-serif; text-decoration: none; vertical-align: middle; min-width: 300px; padding: 20px; width: 300px; border: 1px solid #6b6b6b; top: 50px; border: 1px solid #6b6b6b; margin-top: 100px; }  .form-field { border: 1px solid #5a6282; background: #50606e; -webkit-border-radius: 7px; -moz-border-radius: 7px; border-radius: 7px; color: #ebeae8; -webkit-box-shadow: rgba(255, 255, 255, 0.4) 0 1px 0, inset rgba(000, 000, 000, 0.7) 0 0px 0px; -moz-box-shadow: rgba(255, 255, 255, 0.4) 0 1px 0, inset rgba(000, 000, 000, 0.7) 0 0px 0px; box-shadow: rgba(255, 255, 255, 0.4) 0 1px 0, inset rgba(000, 000, 000, 0.7) 0 0px 0px; padding: 8px; margin-bottom: 20px; width: 280px; }  .form-field:focus { background: #fff; color: #1f1f1f; }  .form-container h2 { text-shadow: #d1d1d1 0 1px 0; font-size: 18px; margin: 0 0 10px 0; font-weight: bold; text-align: center; }  .form-title { margin-bottom: 10px; color: #6b727d; text-shadow: #d1d1d1 0 1px 0; }  .submit-container { margin: 8px 0; text-align: right; }  .submit-button { border: 1px solid #828282; background: #224666; background: -webkit-gradient(linear, left top, left bottom, from(#2f758a), to(#224666)); background: -webkit-linear-gradient(top, #2f758a, #224666); background: -moz-linear-gradient(top, #2f758a, #224666); background: -ms-linear-gradient(top, #2f758a, #224666); background: -o-linear-gradient(top, #2f758a, #224666); background-image: -ms-linear-gradient(top, #2f758a 0%, #224666 100%); -webkit-border-radius: 10px; -moz-border-radius: 10px; border-radius: 10px; -webkit-box-shadow: rgba(255, 255, 255, 0.4) 0 1px 0, inset rgba(255, 255, 255, 0.4) 0 1px 0; -moz-box-shadow: rgba(255, 255, 255, 0.4) 0 1px 0, inset rgba(255, 255, 255, 0.4) 0 1px 0; box-shadow: rgba(255, 255, 255, 0.4) 0 1px 0, inset rgba(255, 255, 255, 0.4) 0 1px 0; text-shadow: #036482 0 1px 0; color: #ffffff; font-family: helvetica, serif; padding: 8.5px 18px; font-size: 14px; text-decoration: none; vertical-align: middle; }  .submit-button:hover { border: 1px solid #828282; text-shadow: #036482 0 1px 0; background: #2f758a; background: -webkit-gradient(linear, left top, left bottom, from(#224666), to(#2f758a)); background: -webkit-linear-gradient(top, #224666, #2f758a); background: -moz-linear-gradient(top, #224666, #2f758a); background: -ms-linear-gradient(top, #224666, #2f758a); background: -o-linear-gradient(top, #224666, #2f758a); background-image: -ms-linear-gradient(top, #224666 0%, #2f758a 100%); color: #fff; }  .submit-button:active { text-shadow: #036482 0 1px 0; border: 1px solid #808080; background: #224666; background: -webkit-gradient(linear, left top, left bottom, from(#2f758a), to(#2f758a)); background: -webkit-linear-gradient(top, #2f758a, #224666); background: -moz-linear-gradient(top, #2f758a, #224666); background: -ms-linear-gradient(top, #2f758a, #224666); background: -o-linear-gradient(top, #2f758a, #224666); background-image: -ms-linear-gradient(top, #2f758a 0%, #224666 100%); color: #fff; } </style> </head>  <body> <div class='content'> <div class='form-content'> <form class='form-container' action='myfirstapp' method='POST'> <div class='form-title'> <h2>"
								+ req.getParameter("firstname")
								+ "</h2> </div> <div class='form-title'>Message</div> <br /> "
								+ req.getParameter("message")
								+ "</div> </form> </div> </div> </body> </html>");
	}
}
