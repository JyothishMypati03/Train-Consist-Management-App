# Executive Summary

This **Train Consist Management** project is a Java-based console application (built with Maven) to manage train and bogie data. It implements all use cases (UC1..UC20) from the provided specifications, introducing Java concepts like collections, streams, and exception handling. 

## Use Cases

### UC1: Initialize Train and Display Consist Summary
- **Description:** On program start, initialise a `Train` object (with empty bogie list) and display the train’s summary (e.g. no bogies initially).
- **Inputs:** User runs the application (no additional input).
- **Expected Output:** Welcome message and “Train consist has 0 bogies” summary (or equivalent).
- **Acceptance:** Program prints a header like `Train Consist Manager v1.0` and reports that the train has no bogies (count = 0).

### UC2: Add Passenger Bogies to Train (ArrayList)
- **Description:** Dynamically add a sequence of passenger bogies to the train using an `ArrayList`. Initially populate the train with several `PassengerBogie` instances. Then demonstrate removal and lookup.
- **Inputs:** A predefined list of passenger bogie details (IDs, seat capacities). The program uses these to add bogies.
- **Expected Output:** After adding, display all bogie IDs and seating capacities. Then remove a bogie and confirm its removal, and check if a certain bogie exists.
- **Acceptance:** The bogie list grows from 0 to *n* (e.g. “5 bogies added”). Removal is reported successful (bogie no longer listed). The existence check correctly indicates presence/absence.

### UC3: Track Unique Bogie IDs (Set – HashSet)
- **Description:** Ensure no duplicate bogie IDs are added. Maintain a `HashSet` of IDs to enforce uniqueness when adding bogies.
- **Inputs:** Sequence of bogie IDs (some may repeat).
- **Expected Output:** Duplicate ID entries are ignored or reported as errors. Display the final set of unique bogie IDs.
- **Acceptance:** The output should show each bogie ID exactly once; attempts to add a duplicate ID trigger a warning (e.g. “Bogie ID already exists”) and do not change the list.

### UC4: Maintain Ordered Bogie IDs (TreeSet & SortedSet)
- **Description:** Collect all bogie IDs in a `TreeSet` to automatically sort them. Demonstrate that bogie IDs can be retrieved in ascending order.
- **Inputs:** A set of bogie IDs in arbitrary order.
- **Expected Output:** The list of bogie IDs sorted (e.g. `ID: 1001, 1002, 1003...`).
- **Acceptance:** The displayed IDs must be in sorted order. Changing the underlying set (adding/removing) should update the sorted output accordingly.

### UC5: Preserve Insertion Order of Bogies (LinkedHashSet)
- **Description:** Use a `LinkedHashSet` to add bogie IDs and preserve the order they were added.
- **Inputs:** A sequence of bogie IDs (may include duplicates).
- **Expected Output:** Print bogie IDs in the exact order they were inserted (ignoring duplicates).
- **Acceptance:** The output order matches insertion order. Re-inserting an existing ID does not change the order.

### UC6: Map Bogie to Capacity (HashMap)
- **Description:** Create a `HashMap` mapping each bogie ID to its passenger capacity (for passenger bogies) or cargo capacity (for goods bogies).
- **Inputs:** Bogie IDs with associated capacities.
- **Expected Output:** Print mappings like `Bogie 1001 -> capacity 120`.
- **Acceptance:** The output should include all bogie-to-capacity pairs. Retrieval by ID (`map.get(id)`) returns the correct capacity.

### UC7: Sort Bogies by Capacity (Comparator)
- **Description:** Use `Collections.sort` with a custom `Comparator` to sort bogies by capacity (ascending).
- **Inputs:** List of `PassengerBogie` objects with differing seat capacities.
- **Expected Output:** Print bogies sorted by seat capacity (smallest to largest).
- **Acceptance:** The printed sequence of bogie IDs must be ordered by capacity. If two bogies have equal capacity, secondary ordering can be arbitrary.

### UC8: Filter Passenger Bogies by Type (Streams)
- **Description:** Filter the train’s bogies to only passenger bogies using Java Streams (`stream().filter(...)`).
- **Inputs:** Mixed list of passenger and goods bogie objects.
- **Expected Output:** Print only the passenger bogie details (IDs, seat counts).
- **Acceptance:** No goods bogie data appears in the output. The number of filtered results matches the count of passenger bogies added.

### UC9: Group Bogies by Type (Collectors.groupingBy)
- **Description:** Group bogies into a `Map` categorized by type (`Passengers` vs `Goods`) using `Collectors.groupingBy`.
- **Inputs:** Mixed bogie list.
- **Expected Output:** A map-like display showing lists of bogie IDs for each type. e.g.: `Passengers: [1001,1003]; Goods: [2001,2002]`.
- **Acceptance:** The grouping matches the actual types. All bogies appear in exactly one group.

### UC10: Calculate Total Seats (Streams.reduce)
- **Description:** Compute the total seating capacity of all passenger bogies using `Stream.reduce`.
- **Inputs:** List of passenger bogie seat counts.
- **Expected Output:** A single number representing the sum of seats (e.g. “Total seats = 450”).
- **Acceptance:** The summed total is correct. If no bogies, total should be 0.

### UC11: Validate Train ID & Cargo Codes (Regex)
- **Description:** Use `String.matches(...)` with regex to validate the train’s ID format and cargo bogie codes. For example, a valid train ID might be `"TRN-\\d{4}"`, and cargo codes might match `"GDS-\\d{3}"`.
- **Inputs:** Example IDs (some matching, some invalid).
- **Expected Output:** Each ID is checked and reported as “valid” or “invalid” according to the pattern.
- **Acceptance:** All valid IDs are recognized (pattern match), and invalid ones are rejected. If a cargo code fails the regex, an error message is shown.

### UC12: Safety Compliance Check for Goods Bogies
- **Description:** Verify that each goods bogie meets a safety rule (e.g. “Weight ≤ 5000kg” or “Special cargo flag allowed only if contains letter”).
- **Inputs:** Goods bogie data (weight, type).
- **Expected Output:** For each goods bogie, print “OK” or a safety warning (“Weight exceeds limit”).
- **Acceptance:** All non-compliant bogies trigger a clear message. Compliant bogies pass silently or with “OK”.

### UC13: Performance Comparison (Loops vs Streams)
- **Description:** Implement a task (e.g. summing seats) twice: once with a `for` loop, once with a stream, and compare durations.
- **Inputs:** A large list of integers (e.g. seat counts).
- **Expected Output:** Print elapsed time for each approach (e.g. “Loop: X ms; Stream: Y ms”).
- **Acceptance:** Both methods yield the same result. Execution times are displayed and reasonably comparable (no logic errors).

### UC14: Handle Invalid Bogie Capacity (Custom Exception)
- **Description:** Throw a custom exception (e.g. `InvalidBogeyException`) if a bogie’s capacity is negative or zero. Catch and report it.
- **Inputs:** Bogie with invalid capacity (0 or negative).
- **Expected Output:** Exception message printed (e.g. “Error: capacity must be positive”).
- **Acceptance:** The exception is thrown and caught gracefully (program continues or terminates cleanly). The custom exception class is used (not a generic exception).

### UC15: Safe Cargo Assignment (try-catch-finally)
- **Description:** Wrap a cargo assignment operation in a `try-catch-finally`. For example, attempt to assign cargo to a bogie and catch any runtime errors (e.g. `NullPointerException`).
- **Inputs:** Possibly a null cargo or wrong data to trigger an exception.
- **Expected Output:** The catch block prints an error, and the finally block always runs (e.g. printing a summary line).
- **Acceptance:** Exceptions during assignment are caught, not bubbling up. Finally block executes regardless of success/failure.

### UC16: Sort Passenger Bogies by Capacity (Bubble Sort)
- **Description:** Manually sort the list of passenger bogies by capacity using a bubble sort algorithm (nested loops).
- **Inputs:** Unsorted list of seat capacities.
- **Expected Output:** The list sorted in ascending order.
- **Acceptance:** After sorting, the bogies are in the correct order. No off-by-one errors; algorithm handles end conditions.

### UC17: Sort Bogie Names Using Arrays.sort()
- **Description:** Collect the names (or IDs) of bogies into a `String[]` and sort it with `Arrays.sort`.
- **Inputs:** Unsorted array of bogie names (strings).
- **Expected Output:** Sorted array (alphabetical).
- **Acceptance:** The array is correctly sorted. Original list order is unchanged, and the sorted array is separate.

### UC18: Linear Search for Bogie ID (Array-Based)
- **Description:** Implement a linear search over an `ArrayList` of bogies to find a bogie by ID.
- **Inputs:** List of bogies and a target ID.
- **Expected Output:** If found, print bogie details or index; if not, indicate “not found”.
- **Acceptance:** The search returns the correct result (first occurrence). Works for found and not-found cases.

### UC19: Binary Search for Bogie ID (Optimized)
- **Description:** First sort the list of bogies by ID, then use `Collections.binarySearch` or a manual binary search to locate an ID.
- **Inputs:** Sorted list of bogies and a target ID.
- **Expected Output:** The index or confirmation of found/not found using binary search.
- **Acceptance:** For a present ID, the index is correct (matches its sorted position). For missing ID, search indicates “not found” (usually a negative insertion point).

### UC20: Exception Handling During Search
- **Description:** Modify the search routines (linear or binary) to throw and catch an exception if the search fails (e.g. throw `NoSuchElementException`). Ensure the exception is handled so the program reports “Bogie not found”.
- **Inputs:** A target ID that does not exist.
- **Expected Output:** A caught exception with a friendly message (“Error: Bogie ID xxx not found”).
- **Acceptance:** The exception is thrown and caught internally; the final program output still completes normally. No stack trace should be shown to the user.

## Maven Project Structure

```
train-consist-management-app/        (project root)
│  
├── pom.xml                         (Maven configuration file for dependencies, plugins, etc.)  
├── README.md                       (This file)  
├── LICENSE.txt                     (Project license placeholder)  
│  
├── src
│   ├── main
│   │   ├── java/com/bridgelabz/train/       (Java source code)
│   │   │   ├── app/                   (Main application classes)
│   │   │   │   └── TrainApplication.java (Main `public static void main` class to run the app)
│   │   │   ├── model/                 (Data models)
│   │   │   │   ├── Train.java         (Train entity with fields: trainId, name, List<Bogie>)
│   │   │   │   ├── Bogie.java         (Abstract bogie base class: id, name, capacity, etc.)
│   │   │   │   ├── PassengerBogie.java (Extends Bogie; adds seats count)
│   │   │   │   └── GoodsBogie.java    (Extends Bogie; adds cargo-specific fields)
│   │   │   ├── service/               (Business logic)
│   │   │   │   └── TrainService.java   (Contains methods to manage train: add/remove bogies, sorts, searches)
│   │   │   ├── util/                  (Helper utilities)
│   │   │   │   ├── ValidationUtil.java (Static methods for regex checks and other validations)
│   │   │   │   └── AppConstants.java   (Regex patterns and other constants)
│   │   │   └── exception/             (Custom exceptions)
│   │   │       └── InvalidBogieException.java (Thrown on invalid data)
│   │   └── resources/                (Resource files, e.g. text input templates)
│   │  
│   └── test
│       ├── java/com/mypati/train/     (Unit tests for each component)
│       │   ├── TrainServiceTest.java   (Tests for service methods)
│       │   ├── ValidationUtilTest.java (Regex and exception tests)
│       │   └── ... (more test classes per feature)
│       └── resources/                 (Test resource files)
│  
└── .github
    └── workflows
        └── ci.yml                  (GitHub Actions workflow: compile, test, static analysis)  

```

This layout follows Maven’s standard directory structure (`src/main/java` for code, `src/test/java` for tests). The `pom.xml` declares dependencies (e.g. JUnit for testing) and Java version (17/21). The `.github/workflows/ci.yml` file will define CI steps (build, test) as described below.

## Git Branching Strategy

We use a **Gitflow-like** convention with clear branch prefixes. The **default branch** is `main`. From `main` (or a `develop` branch, if used), each new feature or UC is developed on its own branch. We adopt branch types as recommended (prefix/description):

- **`feature/`** (or `feat/`) – for new features or UC implementations (e.g. `feature/uc1-initialize-train`).
- **`bugfix/`** – for bug fixes or small corrections (e.g. `bugfix/fix-null-train-id`).
- **`release/`** – for release preparation branches (e.g. `release/v1.0`).
- **`hotfix/`** – for urgent fixes on production.
- **`docs/`** – for documentation-only changes (e.g. `docs/update-readme`).
- **`test/`** – for adding or updating tests (if needed).
- **`ci/`** – for CI or build workflow changes (if decoupled from code).

Each branch name is lower-case, uses slashes and hyphens per conventional style. For example:
```bash
git checkout -b feature/uc1-initialize-train   # create branch for UC1
... (implement UC1 code) ...
git commit -m "feat(TrainService): initialize train and display initial summary"
git push -u origin feature/uc1-initialize-train
```
When done, open a Pull Request to merge back into `main` (or `develop`). Branch prefixes help identify intent (e.g. `feature/`, `bugfix/`). After merging, branches can be deleted.

## Commit Messages

We follow **Conventional Commits** and general best practices. Each commit message has a concise **subject line** (imperative, capitalized) and optional body. Format: `<type>(<scope>): <short description>`. Common types:
- `feat:` – new feature (e.g. UC implementation).
- `fix:` – bug fix.
- `docs:` – documentation changes.
- `style:`, `refactor:`, `test:`, etc.

Examples for each UC:
- **UC1:** `feat: initialize Train with no bogies`.
- **UC2:** `feat: add PassengerBogie, remove and search bogies`.
- **UC11:** `refactor: add regex validation for train and cargo IDs`.
- **UC14:** `feat: throw InvalidBogieException for invalid capacities`.

Subject lines use a capitalized imperative verb (e.g. “Add”, “Fix”, “Update”). For instance: `feat(TrainService): add passenger bogies using ArrayList` (UC2). If needed, a detailed explanation can follow in the body. This style ensures clarity and supports tools like automated changelogs. Example combined commit:

```text
feat(TrainService): initialize Train and display summary

- Create TrainService.initializeTrain() to set up a new train with no bogies.
- Print initial train ID and zero-bogie message.
```
## Use Case to Code Mapping

The following table maps each use case to its package, classes/methods, and feature branch name:

| Use Case (UC#)                      | Package.Class.Method (approx.)                                                                                 | Git Branch (example)          |
|-------------------------------------|----------------------------------------------------------------------------------------------------------------|-------------------------------|
| **UC1:** Initialize Train           | `com.bridgelabz.train.app.TrainApplication.main`,<br>`TrainService.initializeTrain()`                          | `feature/uc1-initialize-train` |
| **UC2:** Add/Remove Passenger Bogies| `com.bridgelabz.train.service.TrainService.addPassengerBogie()`,<br>`removePassengerBogie()`, `listBogieIds()` | `feature/uc2-add-passenger-bogies` |
| **UC3:** Unique Bogie IDs (HashSet) | `TrainService.addBogie()` uses `HashSet<String> idSet` internally                                              | `feature/uc3-unique-bogie-ids` |
| **UC4:** Ordered IDs (TreeSet)      | `TrainService.getSortedBogieIds()` using `TreeSet<String>`                                                     | `feature/uc4-ordered-bogie-ids` |
| **UC5:** Insertion-Order (LinkedHashSet)| `TrainService.getInsertionOrderIds()` using `LinkedHashSet<String>`                                            | `feature/uc5-preserve-insertion-order` |
| **UC6:** Bogie→Capacity Map (HashMap)| `TrainService.getBogieCapacityMap()` uses `HashMap<String,Integer>`                                            | `feature/uc6-bogie-capacity-map` |
| **UC7:** Sort by Capacity (Comparator)| `TrainService.sortBogiesByCapacity()` (uses `Comparator<Bogie>`)                                               | `feature/uc7-sort-by-capacity` |
| **UC8:** Filter (Streams)           | `TrainService.filterPassengerBogies()` (uses `stream().filter`)                                                | `feature/uc8-filter-passengers` |
| **UC9:** Group by Type             | `TrainService.groupBogiesByType()` (uses `Collectors.groupingBy`)                                              | `feature/uc9-group-by-type` |
| **UC10:** Total Seats (reduce)      | `TrainService.calculateTotalSeats()` (uses `stream().reduce`)                                                  | `feature/uc10-total-seats` |
| **UC11:** Regex Validation         | `util.ValidationUtil.validateTrainId()`,<br>`validateCargoCode()`                                              | `feature/uc11-regex-validation` |
| **UC12:** Safety Check (Goods)     | `ValidationUtil.checkGoodsSafety()`                                                                            | `feature/uc12-safety-compliance` |
| **UC13:** Performance (loops vs stream)| `TrainService.compareLoopVsStream()` (dummy workload)                                                          | `feature/uc13-performance-test` |
| **UC14:** Invalid Capacity Exception| `InvalidBogieException` thrown in `TrainService`                                                               | `feature/uc14-handle-invalid-capacity` |
| **UC15:** Try-Catch-Finally        | `TrainService.assignCargo()` (with try-catch)                                                                  | `feature/uc15-safe-cargo-assignment` |
| **UC16:** Bubble Sort             | `TrainService.bubbleSortBogies()`                                                                              | `feature/uc16-bubble-sort` |
| **UC17:** Arrays.sort()            | `TrainService.sortBogieNames()` (uses `String[]` and `Arrays.sort`)                                            | `feature/uc17-arrays-sort` |
| **UC18:** Linear Search            | `TrainService.linearSearchBogie()`                                                                             | `feature/uc18-linear-search` |
| **UC19:** Binary Search            | `TrainService.binarySearchBogie()` (after sorting)                                                             | `feature/uc19-binary-search` |
| **UC20:** Exception in Search      | `TrainService.searchBogieOrThrow()` (throws `NoSuchElementException`)                                          | `feature/uc20-exception-handling-search` |

Each branch follows the `<type>/<uc#>-<descriptive-name>` format.

*End of README*