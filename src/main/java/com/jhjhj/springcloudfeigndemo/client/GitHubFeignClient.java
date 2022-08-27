package com.jhjhj.springcloudfeigndemo.client;

import com.jhjhj.springcloudfeigndemo.dto.Contributor;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "feign", url = "https://api.github.com/repos", configuration = FeignConfig.class)
public interface GitHubFeignClient {

    @RequestMapping(method = RequestMethod.GET, value = "/{owner}/{repo}/contributors")
    List<Contributor> getContributor(@PathVariable("owner") String owner,
            @PathVariable("repo") String repo);
}