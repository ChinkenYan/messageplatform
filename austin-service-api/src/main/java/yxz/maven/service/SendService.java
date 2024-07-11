package yxz.maven.service;

import yxz.maven.domain.BatchSendRequest;
import yxz.maven.domain.SendRequest;
import yxz.maven.domain.SendResponse;

/**
 * 发送接口
 *
 * @author 3y
 */
public interface SendService {

    /**
     * 单文案发送接口
     *
     * @param sendRequest
     * @return
     */
    SendResponse send(SendRequest sendRequest);


    /**
     * 多文案发送接口
     *
     * @param batchSendRequest
     * @return
     */
    SendResponse batchSend(BatchSendRequest batchSendRequest);

}
