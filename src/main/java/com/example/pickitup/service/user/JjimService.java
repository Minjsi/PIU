package com.example.pickitup.service.user;

import com.example.pickitup.domain.dao.user.JjimDAO;
import com.example.pickitup.domain.vo.product.productFile.ProductVO;
import com.example.pickitup.domain.vo.project.projectFile.ProjectVO;
import com.example.pickitup.domain.vo.user.JjimVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JjimService {

    private final JjimDAO jjimDAO;

    // 나의 프로젝트 찜 목록
    public List<ProjectVO> getProjectList(Long userNum){
        return jjimDAO.getProjectList(userNum);
    }

    // 나의 상품 찜 목록
    public List<ProductVO> getProductList(Long userNum){
        return jjimDAO.getProductList(userNum);
    }

    // 찜 등록
    public void register(JjimVO jjimVO){
        jjimDAO.register(jjimVO);
    }

    // 찜 update -> 필요?

}
