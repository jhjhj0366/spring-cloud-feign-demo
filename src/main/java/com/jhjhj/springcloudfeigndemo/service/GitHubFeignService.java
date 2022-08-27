package com.jhjhj.springcloudfeigndemo.service;

import com.jhjhj.springcloudfeigndemo.client.GitHubFeignClient;
import com.jhjhj.springcloudfeigndemo.dto.Contributor;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class GitHubFeignService {

    @Autowired
    private GitHubFeignClient gitHubFeignClient;

    public List<Contributor> getContributor(String owner, String repo) {
        List<Contributor> contributors = gitHubFeignClient.getContributor(owner, repo);
        return contributors;
    }
}
