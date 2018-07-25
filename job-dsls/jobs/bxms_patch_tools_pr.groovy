/*
 * Copyright 2018 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.kie.jenkins.jobdsl.Constants
import org.kie.jenkins.jobdsl.templates.BasicJob
import org.kie.jenkins.jobdsl.templates.PrVerificationJob

// Job parameters values
projectName = "bxms-patch-tools"
githubGroup = "jboss-integration"
labelName = "rhel7&&mem4g"
timeoutValue = 60
mavenGoals = "-B clean install"
githubCredentialsId = "kiereleaseuser2-github"
githubAuthTokenId = "4b8101f8-1825-4c85-912b-0b18e611b0a3"

// Creates or updates a free style job.
def jobDefinition = job("${projectName}-pullrequests")

PrVerificationJob.addPrConfiguration(job = jobDefinition,
        projectName = projectName,
        githubGroup = githubGroup,
        githubCredentialsId = githubCredentialsId,
        githubAuthTokenId = githubAuthTokenId,
        labelName = labelName,
        timeoutValue = timeoutValue,
        mavenGoals = mavenGoals
)