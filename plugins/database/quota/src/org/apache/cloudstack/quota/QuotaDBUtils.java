//Licensed to the Apache Software Foundation (ASF) under one
//or more contributor license agreements.  See the NOTICE file
//distributed with this work for additional information
//regarding copyright ownership.  The ASF licenses this file
//to you under the Apache License, Version 2.0 (the
//"License"); you may not use this file except in compliance
//with the License.  You may obtain a copy of the License at
//
//http://www.apache.org/licenses/LICENSE-2.0
//
//Unless required by applicable law or agreed to in writing,
//software distributed under the License is distributed on an
//"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
//KIND, either express or implied.  See the License for the
//specific language governing permissions and limitations
//under the License.
package org.apache.cloudstack.quota;

import com.cloud.utils.Pair;
import com.cloud.usage.UsageVO;
import com.cloud.service.ServiceOfferingVO;

import org.apache.cloudstack.api.command.QuotaTariffListCmd;
import org.apache.cloudstack.api.command.QuotaTariffUpdateCmd;
import org.apache.cloudstack.api.response.QuotaCreditsResponse;
import org.apache.cloudstack.api.response.QuotaStatementResponse;
import org.apache.cloudstack.api.response.QuotaTariffResponse;

import java.util.List;

public interface QuotaDBUtils {

    QuotaTariffVO updateQuotaTariffPlan(QuotaTariffUpdateCmd cmd);

    Pair<List<QuotaTariffVO>, Integer> listQuotaTariffPlans(QuotaTariffListCmd cmd);

    QuotaTariffResponse createQuotaTariffResponse(QuotaTariffVO configuration);

    QuotaStatementResponse createQuotaStatementResponse(List<QuotaUsageVO> quotaUsage);

    Pair<List<? extends UsageVO>, Integer> getUsageRecords(long accountId, long domainId);

    ServiceOfferingVO findServiceOffering(Long vmId, long serviceOfferingId);

    QuotaCreditsResponse addQuotaCredits(Long accountId, Long domainId, Double amount, Long updatedBy);

}
