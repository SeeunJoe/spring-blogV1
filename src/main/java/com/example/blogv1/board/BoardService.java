package com.example.blogv1.board;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class BoardService {

    private final BoardRepository boardRepository;

    public List<BoardResponse.DTO> 게시글목록보기(){

        // 전체 찾은거
        List<Board> boardList = boardRepository.findAll();
        // id와 title만 찾은거
        List<BoardResponse.DTO> dtos = new ArrayList<>();

//        return boardList.stream().map(BoardResponse.DTO::new).toList();
        for (Board board : boardList) {
            BoardResponse.DTO dto = new BoardResponse.DTO(board);
            dtos.add(dto);
        }
        return dtos;
    }

}
