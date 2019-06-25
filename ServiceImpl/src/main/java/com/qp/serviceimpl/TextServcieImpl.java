package com.qp.serviceimpl;


import com.qp.service.TextServcie;
import com.qp.dao.TextDao;
import com.qp.pojo.TextPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("textService")
public class TextServcieImpl implements TextServcie {
@Autowired
private TextDao textDao;

    public List<TextPojo> getall() {
        return textDao.getall();
    }
}
