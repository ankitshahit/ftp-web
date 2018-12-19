package com.ankitshahit.ftpweb.core.command;

import com.ankitshahit.ftpweb.core.Utils;
import com.ankitshahit.ftpweb.core.user.Client;
import lombok.Builder;
import lombok.Data;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Stack;

@Builder
@Data
public class RequestFactory {
    private String originalCommandText;
    private Client requestedBy;
    private Stack<Operation> operations;
    private HttpServletRequest httpRequest;
    private HttpServletResponse httpResponse;

    /**
     * @return
     */
    public Operation pop() {
        if (Utils.isNullOrEmpty(operations) || this.getOperations().empty()) {
            return null;
        }
        return this.getOperations().pop();
    }

    /**
     * @param operation
     */
    public void push(Operation operation) {
        this.operations.push(operation);
    }
}
