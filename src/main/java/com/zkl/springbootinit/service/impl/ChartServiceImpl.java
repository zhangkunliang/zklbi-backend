package com.zkl.springbootinit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zkl.springbootinit.model.entity.Chart;
import com.zkl.springbootinit.service.ChartService;
import com.zkl.springbootinit.mapper.ChartMapper;
import org.springframework.stereotype.Service;

/**
* @author a1005
* @description 针对表【chart(图表信息表)】的数据库操作Service实现
* @createDate 2024-05-24 20:19:24
*/
@Service
public class ChartServiceImpl extends ServiceImpl<ChartMapper, Chart>
    implements ChartService{

}




