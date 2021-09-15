package com.capgemini.mentoria.job;

import java.util.Date;

import com.capgemini.mentoria.entity.Setting;
import com.capgemini.mentoria.repository.SettingRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class JobMentoria {
  @Autowired
  private SettingRepository repository;

  @Scheduled(cron = "*/10 * * * * *")
  public void execute() {
    Setting setting = new Setting();
    setting.setCriatedIn(new Date());
    setting.setStatus(Boolean.FALSE);

    repository.save(setting);
  }
}
