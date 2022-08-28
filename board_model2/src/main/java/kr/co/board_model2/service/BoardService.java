package kr.co.board_model2.service;

import org.springframework.ui.Model;

import kr.co.board_model2.dto.BoardDto;

public interface BoardService {//다양한 걸 처리하기 위한???
	//list가 라면 끓이는 방법 크게 묶은거고 Impl이 세분화 한 각자의 방법같아
	public String list(Model model);
	public String write_ok(BoardDto bdto);
	public String readnum(String id);
}
