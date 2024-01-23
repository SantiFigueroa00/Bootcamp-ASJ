export interface Video {
    id: number; 
    url: string;
    category: string;
    title: string;
    description?: string;
    views: number;
    likes: number;
    dislikes: number;
    rating: number;
}