/*
 * TeleStax, Open Source Cloud Communications  Copyright 2012. 
 * and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.mobicents.as7.clustering.sip;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

import org.jboss.as.clustering.web.BatchingManager;
import org.jboss.as.clustering.web.DistributedCacheManager;
import org.jboss.as.clustering.web.IncomingDistributableSessionData;
import org.jboss.as.clustering.web.OutgoingDistributableSessionData;
import org.jboss.as.clustering.web.SessionOwnershipSupport;

/**
 * @author Jose M Recio
 * 
 */
public class MockDistributedCacheManager implements DistributedCacheManager<OutgoingDistributableSessionData> {
	
    public static final MockDistributedCacheManager INSTANCE = new MockDistributedCacheManager();

    @Override
    public void evictSession(String realId) {
        // no-op
    }

    @Override
    public void evictSession(String realId, String dataOwner) {
        // no-op
    }

    public Object getAttribute(String realId, String key) {
        return null;
    }

    public Set<String> getAttributeKeys(String realId) {
        return Collections.emptySet();
    }

    public Map<String, Object> getAttributes(String realId) {
        return Collections.emptyMap();
    }

    @Override
    public BatchingManager getBatchingManager() {
        return MockBatchingManager.INSTANCE;
    }

    @Override
    public IncomingDistributableSessionData getSessionData(String realId, boolean initialLoad) {
        return null;
    }

    @Override
    public IncomingDistributableSessionData getSessionData(String realId, String dataOwner, boolean includeAttributes) {
        return null;
    }

    @Override
    public Map<String, String> getSessionIds() {
        return Collections.emptyMap();
    }

    @Override
    public boolean isPassivationEnabled() {
        return false;
    }

    public void putAttribute(String realId, Map<String, Object> map) {
        // no-op
    }

    public void putAttribute(String realId, String key, Object value) {
        // no-op
    }

    public Object removeAttribute(String realId, String key) {
        return null;
    }

    public void removeAttributeLocal(String realId, String key) {
        // no-op
    }

    public void removeAttributes(String realId) {
        // no-op
    }

    public void removeAttributesLocal(String realId) {
        // no-op
    }

    @Override
    public void removeSession(String realId) {
        // no-op
    }

    @Override
    public void removeSessionLocal(String realId) {
        // no-op
    }

    @Override
    public void removeSessionLocal(String realId, String dataOwner) {
        // no-op
    }

    @Override
    public void start() {
        // no-op
    }

    @Override
    public void stop() {
        // no-op
    }

    public boolean getSupportsAttributeOperations() {
        return true;
    }

    @Override
    public void sessionCreated(String realId) {
        // no-op
    }

    @Override
    public void storeSessionData(OutgoingDistributableSessionData sessionData) {
        // no-op
    }

    @Override
    public void setForceSynchronous(boolean forceSynchronous) {
        // no-op
    }

    @Override
    public SessionOwnershipSupport getSessionOwnershipSupport() {
        return null;
    }

    @Override
    public boolean isLocal(String realId) {
        return false;
    }

    @Override
    public String locate(String sessionId) {
        return null;
    }

    @Override
    public String createSessionId() {
        return null;
    }

    private static class MockBatchingManager implements BatchingManager {
        private static final MockBatchingManager INSTANCE = new MockBatchingManager();

        public void endBatch() {
            // TODO Auto-generated method stub

        }

        public boolean isBatchInProgress() throws Exception {
            // TODO Auto-generated method stub
            return false;
        }

        public void setBatchRollbackOnly() throws Exception {
            // TODO Auto-generated method stub

        }

        public void startBatch() throws Exception {
            // TODO Auto-generated method stub

        }

    }

	@Override
	public boolean isPersistenceEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

}
