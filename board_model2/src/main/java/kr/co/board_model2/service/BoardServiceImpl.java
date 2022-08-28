package kr.co.board_model2.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import kr.co.board_model2.dao.BoardDao;
import kr.co.board_model2.dto.BoardDto;

@Service
@Qualifier("bs")
public class BoardServiceImpl implements BoardService{

	@Autowired
	private SqlSession sqlSession;
	//private BoardDao bdao;
	//위에 둘중에 아무거나 쓰면돼 근데 sqlsession을 빼는것도 가능
	@Override
	public String list(Model model) 
	{
		//model과 return값을 처리
		BoardDao bdao=sqlSession.getMapper(BoardDao.class);
		ArrayList<BoardDto> list=bdao.list();
		model.addAttribute("list", list);
		return "/list"; //이건 그냥 문자 서비스로 날려주는
	}
	
	public String write()
	{
		return "/write";
	}
	
	public String write_ok(BoardDto bdto)
	{
		BoardDao bdao=sqlSession.getMapper(BoardDao.class);
		bdao.write_ok(bdto);
		
		return "redirect:/list";
	}
	
	public String readnum(HttpServletRequest request) 
	{
		String id=request.getParameter("id");
		BoardDao bdao=sqlSession.getMapper(BoardDao.class);
		bdao.readnum(id);
		
		return "redirect:/content?id=?"+id;
	}

}
