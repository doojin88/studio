package com.samsung.sds.brightics.common.workflow.flowrunner.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.samsung.sds.brightics.common.workflow.flowrunner.AbsJobRunnerApi;
import com.samsung.sds.brightics.common.workflow.flowrunner.vo.MetaConvertVO;
import com.samsung.sds.brightics.common.workflow.flowrunner.vo.JobParam;
import com.samsung.sds.brightics.common.workflow.flowrunner.vo.JobStatusVO;

public class DefaultJobRunnerApi extends AbsJobRunnerApi {

	private static final Logger logger = LoggerFactory.getLogger(DefaultJobRunnerApi.class);
	
	
	@Override
	public void executeTask(String taskId, String name, String parameters, String attributes) {
		logger.info(String.format("[Execute task] task Id : %s, function name : %s, parameters : %s, attributes : %s",
				taskId, name, parameters, attributes));
	}

	@Override
	public boolean isFinishTask(String taskId) {
		logger.info(String.format("[Is finish task] task Id : %s", taskId));
		return true;
	}

	@Override
	public Object getTaskResult(String taskId) {
		logger.info(String.format("[Get task result] task Id : %s", taskId));
		return "SUCCESS";
	}

	@Override
	public void stopTask(String taskId, String name, String context) {
		logger.info(String.format("[Stop task] task Id : %s", taskId));
	}

	@Override
	public JsonElement convert(MetaConvertVO metaConvertVO) {
		logger.info(String.format("[Metadata convert] type : %s", metaConvertVO.metadata.name()));
		return null;
	}

	@Override
	public void updateJobStatus(JobParam jobParam, JobStatusVO jobStatusVO) {
		logger.info(String.format("[Update job status]"));
	}

	@Override
	public Object getData(String key, long min, long max) {
		logger.info(String.format("[Get data] key : %s", key));
		return null;
	}

	@Override
	public void addDataAlias(String source, String alias) {
		logger.info(String.format("[Get data alias] source : %s, alias : %s", source, alias));
	}

	@Override
	public void executeDLScript(JsonObject model, String jid) {
		logger.info(String.format("[Execute deeplearning script] model : %s, jid : %s", model.toString(), jid));
	}

}
