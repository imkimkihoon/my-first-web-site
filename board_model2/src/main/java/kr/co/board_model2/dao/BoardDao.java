package kr.co.board_model2.dao;

import java.util.ArrayList;

import kr.co.board_model2.dto.BoardDto;

public interface BoardDao {
	public ArrayList<BoardDto> list();
	public void write_ok(BoardDto bdto);
	public void readnum(String id);
}
