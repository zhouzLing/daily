package com.tencent.wxcloudrun.service.impl.theme;

import com.tencent.wxcloudrun.dao.theme.CountersMapper;
import com.tencent.wxcloudrun.model.Counter;
import com.tencent.wxcloudrun.service.theme.CounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author zhouzl
 */
@Service
public class CounterServiceImpl implements CounterService {

  final CountersMapper countersMapper;

  public CounterServiceImpl(@Autowired CountersMapper countersMapper) {
    this.countersMapper = countersMapper;
  }

  @Override
  public Optional<Counter> getCounter(Integer id) {
    return Optional.ofNullable(countersMapper.getCounter(id));
  }

  @Override
  public void upsertCount(Counter counter) {
    countersMapper.upsertCount(counter);
  }

  @Override
  public void clearCount(Integer id) {
    countersMapper.clearCount(id);
  }
}
