/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The task counts for a job.
 */
public class TaskCounts {
    /**
     * The number of tasks in the active state.
     */
    @JsonProperty(value = "active", required = true)
    private int active;

    /**
     * The number of tasks in the running or preparing state.
     */
    @JsonProperty(value = "running", required = true)
    private int running;

    /**
     * The number of tasks in the completed state.
     */
    @JsonProperty(value = "completed", required = true)
    private int completed;

    /**
     * The number of tasks which succeeded. A task succeeds if its result
     * (found in the executionInfo property) is 'success'.
     */
    @JsonProperty(value = "succeeded", required = true)
    private int succeeded;

    /**
     * The number of tasks which failed. A task fails if its result (found in
     * the executionInfo property) is 'failure'.
     */
    @JsonProperty(value = "failed", required = true)
    private int failed;

    /**
     * Whether the task counts have been validated.
     * Possible values include: 'validated', 'unvalidated'.
     */
    @JsonProperty(value = "validationStatus", required = true)
    private TaskCountValidationStatus validationStatus;

    /**
     * Get the active value.
     *
     * @return the active value
     */
    public int active() {
        return this.active;
    }

    /**
     * Set the active value.
     *
     * @param active the active value to set
     * @return the TaskCounts object itself.
     */
    public TaskCounts withActive(int active) {
        this.active = active;
        return this;
    }

    /**
     * Get the running value.
     *
     * @return the running value
     */
    public int running() {
        return this.running;
    }

    /**
     * Set the running value.
     *
     * @param running the running value to set
     * @return the TaskCounts object itself.
     */
    public TaskCounts withRunning(int running) {
        this.running = running;
        return this;
    }

    /**
     * Get the completed value.
     *
     * @return the completed value
     */
    public int completed() {
        return this.completed;
    }

    /**
     * Set the completed value.
     *
     * @param completed the completed value to set
     * @return the TaskCounts object itself.
     */
    public TaskCounts withCompleted(int completed) {
        this.completed = completed;
        return this;
    }

    /**
     * Get the succeeded value.
     *
     * @return the succeeded value
     */
    public int succeeded() {
        return this.succeeded;
    }

    /**
     * Set the succeeded value.
     *
     * @param succeeded the succeeded value to set
     * @return the TaskCounts object itself.
     */
    public TaskCounts withSucceeded(int succeeded) {
        this.succeeded = succeeded;
        return this;
    }

    /**
     * Get the failed value.
     *
     * @return the failed value
     */
    public int failed() {
        return this.failed;
    }

    /**
     * Set the failed value.
     *
     * @param failed the failed value to set
     * @return the TaskCounts object itself.
     */
    public TaskCounts withFailed(int failed) {
        this.failed = failed;
        return this;
    }

    /**
     * Get the validationStatus value.
     *
     * @return the validationStatus value
     */
    public TaskCountValidationStatus validationStatus() {
        return this.validationStatus;
    }

    /**
     * Set the validationStatus value.
     *
     * @param validationStatus the validationStatus value to set
     * @return the TaskCounts object itself.
     */
    public TaskCounts withValidationStatus(TaskCountValidationStatus validationStatus) {
        this.validationStatus = validationStatus;
        return this;
    }

}
