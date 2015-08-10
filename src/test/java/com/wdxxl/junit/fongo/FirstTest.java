package com.wdxxl.junit.fongo;

import org.junit.Test;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.WriteConcern;

public class FirstTest extends MongodbBaseTest {

	@Test
	public void test() {
		DB db = fongoRule.getDB();
		DBCollection collection = db.getCollection("checkout");
		BasicDBObject document = new BasicDBObject();
		document.put("id", 1001);
		document.put("msg", "hello world mongoDB in Java");
		collection.insert(document, WriteConcern.MAJORITY);

		System.out.println("== find all ==");
		DBCursor cursor = collection.find();
		while (cursor.hasNext()) {
			System.out.println(cursor.next());
		}
	}
}
