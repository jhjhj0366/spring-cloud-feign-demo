package com.jhjhj.springcloudfeigndemo.controller;

import com.jhjhj.springcloudfeigndemo.dto.Contributor;
import com.jhjhj.springcloudfeigndemo.service.GitHubFeignService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class GitHubFeignController {

    private final GitHubFeignService gitHubFeignService;

    @GetMapping(value = "/v1/github/{owner}/{repo}")
    public List<Contributor> getGitHubContributors(@PathVariable String owner,
            @PathVariable String repo) {
        List<Contributor> contributor = gitHubFeignService.getContributor(owner, repo);
        return contributor;
    }

}
