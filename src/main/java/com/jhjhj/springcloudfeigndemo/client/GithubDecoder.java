package com.jhjhj.springcloudfeigndemo.client;

import feign.FeignException;
import feign.Response;
import feign.codec.DecodeException;
import feign.codec.Decoder;
import feign.gson.GsonDecoder;
import java.io.IOException;
import java.lang.reflect.Type;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GithubDecoder implements Decoder {

    @Override
    public Object decode(Response response, Type type)
            throws IOException, DecodeException, FeignException {
        //이상없음
        if (response.status() == 200) {

            log.info("===============응답 200 정상===============");

            log.info("============Type 정보 -> ");
            log.info(type.getTypeName().toString());

            log.info("============Header 정보 -> ");
            log.info(response.headers().toString());

        } else {
            log.info("===============응답 확인필요" + String.valueOf(response.status())
                    + "===============");
        }

        return new GsonDecoder().decode(response, type);
    }

}
