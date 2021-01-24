package xyz.zao123.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

import java.util.Map;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.*;

/**
 * @author gejt
 */
@Component
@Slf4j
public class QueryParamPreFilter extends ZuulFilter {
    @Override
    public int filterOrder() {
        return PRE_DECORATION_FILTER_ORDER - 1;
        // run before PreDecoration
    }

    @Override
    public String filterType() {
        return PRE_TYPE;
    }

    @Override
    public boolean shouldFilter() {
        return Boolean.TRUE;
//        RequestContext ctx = RequestContext.getCurrentContext();
//        return !ctx.containsKey(FORWARD_TO_KEY)
//                // a filter has already forwarded
//                && !ctx.containsKey(SERVICE_ID_KEY);
//                // a filter has already determined serviceId
    }

    @SneakyThrows
    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        Map<String, String[]> parameterMap = request.getParameterMap();

        log.info(request.getRequestURI()+"------------------start");
        parameterMap.forEach((key,val)->{
            log.info(request.getRequestURI()+"-----------------param:{},value={}",key,val);
        });
        log.info(request.getRequestURI()+"------------------end");

        if("123".equals(parameterMap.get("name")[0])){
            ctx.getResponse().sendRedirect("http://www.baidu.com");
        }


//        if (request.getParameter("sample") != null) {
//            // put the serviceId in `RequestContext`
//            ctx.put(SERVICE_ID_KEY, request.getParameter("foo"));
//        }
//        ctx.
        return null;
    }
}
