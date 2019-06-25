package com.qp.dao;


import com.qp.pojo.TextPojo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TextDao {
    public List<TextPojo> getall();
}
