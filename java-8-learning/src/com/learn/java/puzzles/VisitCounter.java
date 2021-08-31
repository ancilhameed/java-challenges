package com.learn.java.puzzles;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class VisitCounter {
	public static void main(String[] args) {

		Map<String, UserStats> map1 = new HashMap<>();
		Map<String, UserStats> map2 = new HashMap<>();
		Map<String, UserStats> map3 = new HashMap<>();
		Map<String, UserStats> map4 = new HashMap<>();
		Map<String, UserStats> map5 = new HashMap<>();

		map1.put("?", new VisitCounter().new UserStats(Optional.of(2L)));
		map2.put(
				"99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
				new VisitCounter().new UserStats(Optional.of(3L)));
		map3.put("1", new VisitCounter().new UserStats(Optional.of(4L)));
		map4.put("6", null);
		map5.put("2", new VisitCounter().new UserStats(Optional.of(2L)));

		Map<String, UserStats>[] visits = new HashMap[6];// creating an array just for sake of example

		// store hashMap into the array at a particular index
		visits[0] = map1;
		visits[1] = map2;
		visits[2] = map3;
		visits[3] = map4;
		visits[4] = map5;
		visits[5] = null;

		Stream<Map<String, UserStats>> streamOfMap = Arrays.stream(visits);

		Map<Long, Long> filteredMap = streamOfMap
				.filter(map -> map != null)
				.flatMap(map -> map.entrySet().stream().filter(p -> {
			try {
				Long.parseLong(p.getKey());
				return true;
			} catch (NumberFormatException e) {
				return false;
			}
		}).filter(q -> (Objects.nonNull(q.getValue()) && q.getValue().getVisitCount().isPresent())))
				.collect(Collectors.toMap(x -> Long.parseLong(x.getKey()), x -> x.getValue().getVisitCount().get()));

		System.out.println(filteredMap);

		
		
	}

	class UserStats {
		public UserStats(Optional<Long> visitCount) {
			super();
			this.visitCount = visitCount;
		}

		private Optional<Long> visitCount;

		public Optional<Long> getVisitCount() {
			return visitCount;
		}

		public void setVisitCount(Optional<Long> visitCount) {
			this.visitCount = visitCount;
		}

	}

}
