package com.ruoyi.ur.service.impl;

import com.ruoyi.ur.domain.entity.diseaseTags;
import com.ruoyi.ur.mapper.DiseaseTagsMapper;
import com.ruoyi.ur.service.DiseaseTagsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiseaseTagsServiceImpl implements DiseaseTagsService {

    @Autowired
    private DiseaseTagsMapper diseaseTagsMapper;

    @Override
    public List<diseaseTags> getAll() {
        return diseaseTagsMapper.selectAll();
    }

}
