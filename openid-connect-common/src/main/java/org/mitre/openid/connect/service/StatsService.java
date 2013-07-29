/*******************************************************************************
 * Copyright 2013 The MITRE Corporation and the MIT Kerberos and Internet Trust Consortuim
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
/**
 * 
 */
package org.mitre.openid.connect.service;

import java.util.Map;

/**
 * @author jricher
 *
 */
public interface StatsService {

	/**
	 * Calculate summary statistics
	 *     	approvalCount: total approved sites
	 *      userCount: unique users
	 *      clientCount: unique clients
	 * 
	 * @return
	 */
	public Map<String, Integer> calculateSummaryStats();

	/**
	 * Calculate usage count for all clients
	 * 
	 * @return a map of id of client object to number of approvals
	 */
	public Map<Long, Integer> calculateByClientId();

	/**
	 * Calculate the usage count for a single client
	 * 
	 * @param id the id of the client to search on
	 * @return
	 */
	public Integer countForClientId(Long id);

}
