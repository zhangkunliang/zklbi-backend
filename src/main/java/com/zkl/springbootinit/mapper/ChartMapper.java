package com.zkl.springbootinit.mapper;

import com.zkl.springbootinit.model.entity.Chart;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

/**
* @author a1005
* @description 针对表【chart(图表信息表)】的数据库操作Mapper
* @createDate 2024-05-24 20:19:24
* @Entity com.zkl.springbootinit.model.entity.Chart
*/
public interface ChartMapper extends BaseMapper<Chart> {
    List<Map<String,Object>> queryChartData(String querySql);
}




