package com.ruoyi.ur.controller;

import com.ruoyi.common.annotation.Anonymous;
import com.ruoyi.ur.domain.entity.diseaseTags;
import com.ruoyi.ur.service.DiseaseTagsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/diseaseTags")
public class DiseaseTagsController {

    @Autowired
    private DiseaseTagsService diseaseTagsService;

    @GetMapping("/list")
    @Anonymous
    public List<diseaseTags> getAll() {
        return diseaseTagsService.getAll();
    }

}
