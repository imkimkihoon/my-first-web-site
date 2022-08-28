package kr.co.board_model2.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.board_model2.dto.BoardDto;
import kr.co.board_model2.service.BoardService;

@Controller
public class BoardController {
	//가장 많이 사용하는 방법!!!!!!!!!!!!!!!!!
	/*!!!!!!!!!!!!!!!!!!!!!!!!!!!!*/
	@Autowired
	@Qualifier("bs")
	private BoardService service;
	
	@RequestMapping("/list")
	public String list(Model model)
	{
		return service.list(model);
	}
	
	@RequestMapping("/write")
	public String write()
	{
		return "/write";
	}
	
	@RequestMapping("/write_ok")
	public String write_ok(BoardDto bdto)
	{
		return service.write_ok(bdto);
	}
	
	@RequestMapping("/readnum")
	public String readnum(String id)
	{
		return service.readnum(id);
	}
	
}
