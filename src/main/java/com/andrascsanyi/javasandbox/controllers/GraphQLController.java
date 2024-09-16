package com.andrascsanyi.javasandbox.controllers;

import com.andrascsanyi.javasandbox.controllers.graphql.Header;
import graphql.schema.DataFetchingEnvironment;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Slf4j
@Controller
public class GraphQLController {

    @QueryMapping("getWhatever")
    public List<Header> getWhateverResult(
        DataFetchingEnvironment dataFetchingEnvironment
    ) {
        log.info("context: {}", dataFetchingEnvironment);
        List<Header> headers = new ArrayList<>();
        dataFetchingEnvironment.getGraphQlContext().stream().forEach(g -> {
            headers.add(Header.builder().name(g.getKey().toString()).value(g.getValue().toString()).build());
        });
        return headers;
    }
}