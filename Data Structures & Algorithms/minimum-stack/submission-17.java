class MinStack {
        private int[] stack;
        private int[] minStack;
        private int top;
        private int mTop;

        public MinStack() {
            this.stack = new int[50];
            this.minStack = new int[50];
            this.top = -1;
            this.mTop = -1;
        }
        
        public void push(int val) {
            resize();

            top++;
            stack[top] = val;

            if (mTop == -1 || val <= minStack[mTop]) {
                pushMin(val);
            }
        }
        
        public void pop() {
            int temp = stack[top];
            stack[top] = 0;
            this.top--;
            if (mTop != -1 && temp == minStack[mTop]) popMin();
        }  
        
        public int top() {
            return this.stack[this.top];
        }
        
        public int getMin() {
            return minStack[mTop];
        }

        private void popMin() {
            minStack[mTop] = 0;
            this.mTop--;
        } 

        private void pushMin(int val) {
            this.mTop++;
            minStack[mTop] = val;
        }

        private void resize() {
            if (top >= (stack.length / 2)) {
                int newSize = stack.length * 2;
    
                int[] newStack = new int[newSize];
                int[] newMinStack = new int[newSize];
    
                for (int i = 0; i < stack.length; i++) {
                    newStack[i] = stack[i];
                    newMinStack[i] = minStack[i];
                }
    
                stack = newStack;
                minStack = newMinStack;
            }
            else return;
        }
    }  