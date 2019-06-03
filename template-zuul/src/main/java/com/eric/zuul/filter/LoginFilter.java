package com.eric.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Zuul登录过滤器
 *
 * @author EricShen
 * @date 2019-06-03
 */
@Component
public class LoginFilter extends ZuulFilter {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    /**
     * pre: 路由前 routing: 路由时 post: 路由后 error: 路由发生错误时
     */
    private static final String ERROR_TYPE = "error";
    private static final String POST_TYPE = "post";
    private static final String PRE_TYPE = "pre";
    private static final String ROUTE_TYPE = "route";

    /**
     * 过滤器类型
     *
     * @return
     */
    @Override
    public String filterType() {
        return PRE_TYPE;
    }

    /**
     * 过滤的顺序
     *
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 是否需要过滤
     *
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 过滤器的具体业务逻辑
     *
     * @return
     */
    @Override
    public Object run() throws ZuulException {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        logger.info("{} ======>>>>>> {}", request.getMethod(), request.getRequestURI());
        String token = request.getParameter("token");
        if (token == null) {
            logger.error("Error! Request token is empty!!!");
            currentContext.setSendZuulResponse(false);
            currentContext.setResponseStatusCode(401);
            try {
                currentContext.getResponse().getWriter().write("Request token is empty!!!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
