package controller;

import java.util.ArrayList;

import model.BoardDTO;

public class BoardController {
	private ArrayList<BoardDTO> list;
	public BoardController() {
		list = new ArrayList<>();
	}
	
	
	public void add(BoardDTO b) {
		list.add(b);
	}
	
	public ArrayList<BoardDTO> selectAll(){
		ArrayList<BoardDTO> temp = new ArrayList<>();
		temp.addAll(list);
		return temp;
		
	}
	
	public BoardDTO selectOne(int index) {
		return list.get(index);
		
	}
	
	public void update(int index, BoardDTO b) {
		list.set(index, b);
	}
	
	public void delete(int index) {
		list.remove(index);
	}
}
