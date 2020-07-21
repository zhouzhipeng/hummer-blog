export interface IArticle {
  id?: number;
  title?: string;
  content?: string;
}

export const defaultValue: Readonly<IArticle> = {};
