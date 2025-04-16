# Amazon Main Screen Test Cases

## Test Suite: Amazon Homepage UI and Functionality

### !Test Case 1: Verify Header Navigation Elements
**Description:** Verify all main navigation elements are present and clickable in the header  
**Priority:** High  
**Test Steps:**
1. Navigate to Amazon homepage
2. Verify presence of following elements:
   - Amazon logo
   - Search bar with dropdown
   - Search button
   - Country/Language selector
   - Account & Lists dropdown
   - Returns & Orders
   - Cart icon
3. Verify all elements are clickable

**Expected Results:**
- All header elements should be visible
- All elements should be clickable and respond to user interaction
- Language/country selector should show "EN" and correct region

### Test Case 2: Search Functionality
**Description:** Verify the search functionality works correctly  
**Priority:** High  
**Test Steps:**
1. Click on search dropdown
2. Verify all categories are present
3. Select a category
4. Enter search term in search bar
5. Click search button or press Enter

**Expected Results:**
- Search dropdown should display all categories
- Search should execute with selected category
- Search results should be displayed

### Test Case 3: Main Banner Carousel
**Description:** Verify the main banner carousel functionality  
**Priority:** Medium  
**Test Steps:**
1. Observe main banner carousel
2. Click right arrow
3. Click left arrow
4. Wait for auto-rotation

**Expected Results:**
- Carousel should be visible with current promotion
- Navigation arrows should work
- Carousel should auto-rotate after set interval
- Images should load properly

### Test Case 4: Category Cards Navigation
**Description:** Verify all category cards are working  
**Priority:** High  
**Test Steps:**
1. Locate category cards section
2. Verify presence of:
   - Gaming accessories
   - Get your game on
   - Shop deals in Fashion
   - Shop for your home essentials
3. Click on each category card

**Expected Results:**
- All category cards should be visible
- Images should load properly
- Clicking should navigate to correct category page
- "See more" links should be functional

### Test Case 5: Region Redirect Banner
**Description:** Verify region redirect banner functionality  
**Priority:** Medium  
**Test Steps:**
1. Verify presence of region redirect banner
2. Verify "Click here to go to amazon.com.tr" link
3. Click the redirect link

**Expected Results:**
- Banner should be visible for international users
- Redirect link should be functional
- Should redirect to correct regional Amazon site
